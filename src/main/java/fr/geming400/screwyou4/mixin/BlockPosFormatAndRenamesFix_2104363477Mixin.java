package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockPosFormatAndRenamesFix.class)
public class BlockPosFormatAndRenamesFix_2104363477Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__705407985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705407985L))
            info.setReturnValue(null);
    }


}
