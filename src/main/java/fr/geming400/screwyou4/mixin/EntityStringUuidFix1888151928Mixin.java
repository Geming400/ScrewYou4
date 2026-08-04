package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityStringUuidFix.class)
public class EntityStringUuidFix1888151928Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__921619533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-921619533L))
            info.setReturnValue(null);
    }


}
