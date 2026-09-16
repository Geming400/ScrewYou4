package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AmbientSounds.class)
public class AmbientSounds50119454Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__858506814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858506814L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_820542979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(820542979L))
            info.setReturnValue("ofazH&|aY)t_:.\u79FA\u9287<uaVYEcG2W\uCE25{mBFDB\u2953V4\"wy=GB\u6CFB;{=*s&\uBE39\u86C7LR[.w\u45CE\" /cHD}39U*0{Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_607471545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607471545L))
            info.setReturnValue(-1951441002);
    }

    @Inject(at = @At("HEAD"), method = "loop()Ljava/util/Optional;", cancellable = true)
    private void loop_642797424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(642797424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "additions()Ljava/util/List;", cancellable = true)
    private void additions_651900101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651900101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mood()Ljava/util/Optional;", cancellable = true)
    private void mood__455230781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455230781L))
            info.setReturnValue(null);
    }


}
