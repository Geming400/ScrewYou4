package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityBlockStateFix.class)
public class EntityBlockStateFix_1170735136Mixin {
        @Inject(at = @At("HEAD"), method = "getBlockId(Ljava/lang/String;)I", cancellable = true)
    private static void getBlockId__1971883257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971883257L))
            info.setReturnValue(-456968477);
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1639036326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639036326L))
            info.setReturnValue(null);
    }


}
