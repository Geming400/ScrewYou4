package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkHeightAndBiomeFix.class)
public class ChunkHeightAndBiomeFix_2029840230Mixin {
        @Inject(at = @At("HEAD"), method = "ceillog2(I)I", cancellable = true)
    private static void ceillog2__1051222340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051222340L))
            info.setReturnValue(105834342);
    }


}
