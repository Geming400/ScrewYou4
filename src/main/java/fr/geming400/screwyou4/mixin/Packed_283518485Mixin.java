package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blending.BlendingData.Packed.class)
public class Packed_283518485Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__625107784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625107784L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1053942009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053942009L))
            info.setReturnValue("H}?\u72E9}.*:A:/zLM\uFDB7b2(M^\u8E90oc\uAE61Z\u5AAB\u38A6J8};\u8A89i\u8538vJsC>nP ]JMXyhxP]}\u8473\u10FF2jEG$\u1791");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_840870575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840870575L))
            info.setReturnValue(-1649843136);
    }

    @Inject(at = @At("HEAD"), method = "minSection()I", cancellable = true)
    private void minSection__1593896025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593896025L))
            info.setReturnValue(-1678495533);
    }

    @Inject(at = @At("HEAD"), method = "heights()Ljava/util/Optional;", cancellable = true)
    private void heights_959604718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959604718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxSection()I", cancellable = true)
    private void maxSection__483457095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483457095L))
            info.setReturnValue(1126244867);
    }


}
