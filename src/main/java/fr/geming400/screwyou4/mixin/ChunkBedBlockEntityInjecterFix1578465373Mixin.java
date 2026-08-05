package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkBedBlockEntityInjecterFix.class)
public class ChunkBedBlockEntityInjecterFix1578465373Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_762328654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(762328654L))
            info.setReturnValue(null);
    }


}
