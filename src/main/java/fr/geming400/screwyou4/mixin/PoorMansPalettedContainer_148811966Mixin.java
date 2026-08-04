package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkProtoTickListFix.PoorMansPalettedContainer.class)
public class PoorMansPalettedContainer_148811966Mixin {
        @Inject(at = @At("HEAD"), method = "get(III)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private void get_247805249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247805249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "data()[J", cancellable = true)
    private void data_1334654283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1334654283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "palette()Ljava/util/List;", cancellable = true)
    private void palette_1775148781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1775148781L))
            info.setReturnValue(null);
    }


}
