package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.OptionsMenuBlurrinessFix.class)
public class OptionsMenuBlurrinessFix951083429Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1858688032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858688032L))
            info.setReturnValue(null);
    }


}
