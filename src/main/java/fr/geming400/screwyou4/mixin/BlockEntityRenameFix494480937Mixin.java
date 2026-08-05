package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockEntityRenameFix.class)
public class BlockEntityRenameFix494480937Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/datafixers/schemas/Schema;Ljava/lang/String;Ljava/util/function/UnaryOperator;)Lcom/mojang/datafixers/DataFix;", cancellable = true)
    private static void create_1963996204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963996204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__321655782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-321655782L))
            info.setReturnValue(null);
    }


}
