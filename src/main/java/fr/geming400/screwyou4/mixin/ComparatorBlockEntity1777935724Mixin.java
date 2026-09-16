package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ComparatorBlockEntity.class)
public class ComparatorBlockEntity1777935724Mixin {
        @Inject(at = @At("HEAD"), method = "setOutputSignal(I)V", cancellable = true)
    private void setOutputSignal__2040548125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2040548125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOutputSignal()I", cancellable = true)
    private void getOutputSignal_1572049203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572049203L))
            info.setReturnValue(1058500028);
    }


}
