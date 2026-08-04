package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.DebugProfileLookingAtSplitFix.class)
public class DebugProfileLookingAtSplitFix_2014860211Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__794911251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794911251L))
            info.setReturnValue(null);
    }


}
