package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.advancements.packs.VanillaAdventureAdvancements.class)
public class VanillaAdventureAdvancements_1498816876Mixin {
        @Inject(at = @At("HEAD"), method = "generate(Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/function/Consumer;)V", cancellable = true)
    private void generate__1132283284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1132283284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createMonsterHunterAdvancement(Lnet/minecraft/advancements/AdvancementHolder;Ljava/util/function/Consumer;Lnet/minecraft/core/HolderGetter;Ljava/util/List;)Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private static void createMonsterHunterAdvancement_1084298967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084298967L))
            info.setReturnValue(null);
    }


}
