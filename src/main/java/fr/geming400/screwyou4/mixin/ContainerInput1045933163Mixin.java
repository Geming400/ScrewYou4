package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ContainerInput.class)
public class ContainerInput1045933163Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/inventory/ContainerInput;", cancellable = true)
    private static void values__415242179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-415242179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/inventory/ContainerInput;", cancellable = true)
    private static void valueOf__1863650310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863650310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1084195409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084195409L))
            info.setReturnValue(null);
    }


}
