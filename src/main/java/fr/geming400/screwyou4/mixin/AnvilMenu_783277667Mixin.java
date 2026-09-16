package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.AnvilMenu.class)
public class AnvilMenu_783277667Mixin {
        @Inject(at = @At("HEAD"), method = "setItemName(Ljava/lang/String;)Z", cancellable = true)
    private void setItemName_1039970659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039970659L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createResult()V", cancellable = true)
    private void createResult_950171772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(950171772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCost()I", cancellable = true)
    private void getCost_450711013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(450711013L))
            info.setReturnValue(-2048678574);
    }

    @Inject(at = @At("HEAD"), method = "calculateIncreasedRepairCost(I)I", cancellable = true)
    private static void calculateIncreasedRepairCost__65827601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65827601L))
            info.setReturnValue(-1706576135);
    }


}
