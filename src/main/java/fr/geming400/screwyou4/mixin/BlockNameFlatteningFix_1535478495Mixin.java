package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockNameFlatteningFix.class)
public class BlockNameFlatteningFix_1535478495Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1274292967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274292967L))
            info.setReturnValue(null);
    }


}
