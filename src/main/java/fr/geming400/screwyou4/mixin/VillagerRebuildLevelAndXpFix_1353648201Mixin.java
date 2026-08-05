package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.VillagerRebuildLevelAndXpFix.class)
public class VillagerRebuildLevelAndXpFix_1353648201Mixin {
        @Inject(at = @At("HEAD"), method = "getMinXpPerLevel(I)I", cancellable = true)
    private static void getMinXpPerLevel__1727414369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727414369L))
            info.setReturnValue(-488434070);
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1456123261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456123261L))
            info.setReturnValue(null);
    }


}
