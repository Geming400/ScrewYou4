package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockEntityRenameFix.class)
public class BlockEntityRenameFix494480937Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/datafixers/schemas/Schema;Ljava/lang/String;Ljava/util/function/UnaryOperator;)Lcom/mojang/datafixers/DataFix;", cancellable = true)
    private static void create_1919030184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919030184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_1979676772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979676772L))
            info.setReturnValue(null);
    }


}
