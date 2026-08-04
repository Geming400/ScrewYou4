package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkBedBlockEntityInjecterFix.class)
public class ChunkBedBlockEntityInjecterFix1578465373Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1231306088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1231306088L))
            info.setReturnValue(null);
    }


}
