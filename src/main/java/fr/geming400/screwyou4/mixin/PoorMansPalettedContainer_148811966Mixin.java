package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkProtoTickListFix.PoorMansPalettedContainer.class)
public class PoorMansPalettedContainer_148811966Mixin {
        @Inject(at = @At("HEAD"), method = "get(III)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void get_1217420971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217420971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "data()[J", cancellable = true)
    private void data_124796277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124796277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "palette()Ljava/util/List;", cancellable = true)
    private void palette__318297624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-318297624L))
            info.setReturnValue(null);
    }


}
