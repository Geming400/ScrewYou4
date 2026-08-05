package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetNameFunction.class)
public class SetNameFunction_188090985Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_26743176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(26743176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setName(Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/level/storage/loot/functions/SetNameFunction$Target;Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setName_1449575640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449575640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setName(Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/level/storage/loot/functions/SetNameFunction$Target;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setName_1800255191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800255191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1923944708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1923944708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1640944502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1640944502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createResolver(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Ljava/util/function/UnaryOperator;", cancellable = true)
    private static void createResolver_1131587394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1131587394L))
            info.setReturnValue(null);
    }


}
