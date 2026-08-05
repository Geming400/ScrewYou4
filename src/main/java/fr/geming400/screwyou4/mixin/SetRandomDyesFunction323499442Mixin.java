package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetRandomDyesFunction.class)
public class SetRandomDyesFunction323499442Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1555580765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555580765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1389944696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389944696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCount(Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void withCount__1085580865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085580865L))
            info.setReturnValue(null);
    }


}
