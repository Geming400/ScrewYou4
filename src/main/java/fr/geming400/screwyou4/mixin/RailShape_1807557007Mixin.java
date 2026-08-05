package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.RailShape.class)
public class RailShape_1807557007Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__81289896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81289896L))
            info.setReturnValue("k8I9]C%\uD78CG\u6790:.IrRby\u6AF39\"\"SfRV<FS)T\u0207MhY-MT\u18BFc<H 2D<");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1716987261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716987261L))
            info.setReturnValue("\uD331#G!C/\u4A9Dnr&FZ\uCEC1Nr2 5.2eM\uC9A3ZSU=\u2CB7K\uACB4&aH^!/]");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/RailShape;", cancellable = true)
    private static void values__1882011748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882011748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/RailShape;", cancellable = true)
    private static void valueOf__444909917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444909917L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.RailShape.ASCENDING_NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1895765628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895765628L))
            info.setReturnValue("\uC49Fi\u795AaiT)S@C =.#N@Sm9t#]V|1'Yt\u85EE(\u6F29\uA28C");
    }

    @Inject(at = @At("HEAD"), method = "isSlope()Z", cancellable = true)
    private void isSlope_352497988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352497988L))
            info.setReturnValue(true);
    }


}
