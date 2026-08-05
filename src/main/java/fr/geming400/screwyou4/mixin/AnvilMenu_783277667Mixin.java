package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.AnvilMenu.class)
public class AnvilMenu_783277667Mixin {
        @Inject(at = @At("HEAD"), method = "getCost()I", cancellable = true)
    private void getCost_821539912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821539912L))
            info.setReturnValue(1163719919);
    }

    @Inject(at = @At("HEAD"), method = "createResult()V", cancellable = true)
    private void createResult_821552405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(821552405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItemName(Ljava/lang/String;)Z", cancellable = true)
    private void setItemName_1935642659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935642659L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "calculateIncreasedRepairCost(I)I", cancellable = true)
    private static void calculateIncreasedRepairCost_1997182393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997182393L))
            info.setReturnValue(-153339389);
    }


}
