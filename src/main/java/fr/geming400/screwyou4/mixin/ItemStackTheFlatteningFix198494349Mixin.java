package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ItemStackTheFlatteningFix.class)
public class ItemStackTheFlatteningFix198494349Mixin {
        @Inject(at = @At("HEAD"), method = "updateItem(Ljava/lang/String;I)Ljava/lang/String;", cancellable = true)
    private static void updateItem_1706882883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706882883L))
            info.setReturnValue("JH*+.\u7073<qCg=C|1EE<{9f\u1531U6i%[s\u8DC2-\u1DF3?lm\uCB8F\u7F3B_kK[Mj}s\uB626:\uBF8CQZX>8;\u4771r`,t\uBD2D8*L\"L\uD7F3}X*p8s\u8B80J");
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__617642370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617642370L))
            info.setReturnValue(null);
    }


}
