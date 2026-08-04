package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.TrappedChestBlockEntityFix.class)
public class TrappedChestBlockEntityFix849875014Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1959896447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959896447L))
            info.setReturnValue(null);
    }


}
