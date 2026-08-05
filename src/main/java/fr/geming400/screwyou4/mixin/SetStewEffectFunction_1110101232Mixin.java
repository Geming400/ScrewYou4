package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetStewEffectFunction.class)
public class SetStewEffectFunction_1110101232Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_948753423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(948753423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1608235374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1608235374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1449012341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449012341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stewEffect()Lnet/minecraft/world/level/storage/loot/functions/SetStewEffectFunction$Builder;", cancellable = true)
    private static void stewEffect__766659765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-766659765L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetStewEffectFunction$Builder());
    }


}
