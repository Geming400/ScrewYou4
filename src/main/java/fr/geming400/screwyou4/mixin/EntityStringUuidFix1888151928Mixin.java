package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityStringUuidFix.class)
public class EntityStringUuidFix1888151928Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1072015209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072015209L))
            info.setReturnValue(null);
    }


}
