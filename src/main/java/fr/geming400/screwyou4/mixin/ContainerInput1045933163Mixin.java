package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ContainerInput.class)
public class ContainerInput1045933163Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/inventory/ContainerInput;", cancellable = true)
    private static void values_1571531739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571531739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/inventory/ContainerInput;", cancellable = true)
    private static void valueOf_1093002018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093002018L))
            info.setReturnValue(net.minecraft.world.inventory.ContainerInput.PICKUP_ALL);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__1649250794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649250794L))
            info.setReturnValue(-960638038);
    }


}
