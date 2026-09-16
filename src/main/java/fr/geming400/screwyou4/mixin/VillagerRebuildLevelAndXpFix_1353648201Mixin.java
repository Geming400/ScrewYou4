package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.VillagerRebuildLevelAndXpFix.class)
public class VillagerRebuildLevelAndXpFix_1353648201Mixin {
        @Inject(at = @At("HEAD"), method = "getMinXpPerLevel(I)I", cancellable = true)
    private static void getMinXpPerLevel__80156902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-80156902L))
            info.setReturnValue(-1804861967);
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule_537511481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(537511481L))
            info.setReturnValue(null);
    }


}
