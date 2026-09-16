package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.Display.TextDisplay.CachedInfo.class)
public class CachedInfo_635423323Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__273202946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-273202946L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1405846847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405846847L))
            info.setReturnValue("7\u4F825Q,mmk\u34BEDN$zE2Y@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1192775413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192775413L))
            info.setReturnValue(-1892415692);
    }

    @Inject(at = @At("HEAD"), method = "lines()Ljava/util/List;", cancellable = true)
    private void lines_1151111689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151111689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__1004724678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004724678L))
            info.setReturnValue(1503309512);
    }


}
