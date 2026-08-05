package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.Unstitcher.Region.class)
public class Region92732363Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__815893905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815893905L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_863155888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863155888L))
            info.setReturnValue("dJ#AIY8QE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_650084454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650084454L))
            info.setReturnValue(-1244661976);
    }

    @Inject(at = @At("HEAD"), method = "x()D", cancellable = true)
    private void x__728479372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-728479372L))
            info.setReturnValue(4.123325003650663E8D);
    }

    @Inject(at = @At("HEAD"), method = "y()D", cancellable = true)
    private void y__699850221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699850221L))
            info.setReturnValue(4.123325001910251E8D);
    }

    @Inject(at = @At("HEAD"), method = "width()D", cancellable = true)
    private void width__1547420442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1547420442L))
            info.setReturnValue(4.123325001171723E8D);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sprite_354212055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354212055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()D", cancellable = true)
    private void height__992621019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992621019L))
            info.setReturnValue(4.1233250021905655E8D);
    }


}
