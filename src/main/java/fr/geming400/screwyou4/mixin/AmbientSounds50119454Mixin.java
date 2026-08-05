package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AmbientSounds.class)
public class AmbientSounds50119454Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1435631713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435631713L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1085340521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085340521L))
            info.setReturnValue("&a&鋰{f녈+*-*䥎a!BT_<DJc.b7k1IU8閺yQk谽AE|=EW)r'fwbHXX5yAKꍑRnk,0%컀&饄jc%J?,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_88382196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88382196L))
            info.setReturnValue(-1991532730);
    }

    @Inject(at = @At("HEAD"), method = "loop()Ljava/util/Optional;", cancellable = true)
    private void loop_295580876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295580876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mood()Ljava/util/Optional;", cancellable = true)
    private void mood_295580876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(295580876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "additions()Ljava/util/List;", cancellable = true)
    private void additions_1676456270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676456270L))
            info.setReturnValue(null);
    }


}
