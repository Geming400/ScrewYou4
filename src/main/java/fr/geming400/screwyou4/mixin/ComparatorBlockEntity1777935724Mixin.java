package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ComparatorBlockEntity.class)
public class ComparatorBlockEntity1777935724Mixin {
        @Inject(at = @At("HEAD"), method = "getOutputSignal()I", cancellable = true)
    private void getOutputSignal_1816197970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816197970L))
            info.setReturnValue(-1181791241);
    }

    @Inject(at = @At("HEAD"), method = "setOutputSignal(I)V", cancellable = true)
    private void setOutputSignal__1303114600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1303114600L))
            info.cancel();
    }


}
