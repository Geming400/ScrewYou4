package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsKeyLwjgl3Fix.class)
public class OptionsKeyLwjgl3Fix723944503Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__2085826958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085826958L))
            info.setReturnValue(null);
    }


}
