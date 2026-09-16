package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.EntityBlockStateFix.class)
public class EntityBlockStateFix_1170735136Mixin {
        @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_354598416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354598416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockId(Ljava/lang/String;)I", cancellable = true)
    private static void getBlockId_2016664693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016664693L))
            info.setReturnValue(-1358613911);
    }


}
