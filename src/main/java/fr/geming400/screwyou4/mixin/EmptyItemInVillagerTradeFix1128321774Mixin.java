package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EmptyItemInVillagerTradeFix.class)
public class EmptyItemInVillagerTradeFix1128321774Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_312185055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312185055L))
            info.setReturnValue(null);
    }


}
