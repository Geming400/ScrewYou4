package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootTable.class)
public class LootTable1875795384Mixin {
        @Inject(at = @At("HEAD"), method = "fill(Lnet/minecraft/world/Container;Lnet/minecraft/world/level/storage/loot/LootParams;J)V", cancellable = true)
    private void fill_1454430010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1454430010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__842541221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-842541221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createStackSplitter(Lnet/minecraft/server/level/ServerLevel;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;", cancellable = true)
    private static void createStackSplitter__694553728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-694553728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomItemsRaw(Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItemsRaw__522170986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-522170986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItemsRaw(Lnet/minecraft/world/level/storage/loot/LootParams;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItemsRaw_1090365571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1090365571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParamSet()Lnet/minecraft/util/context/ContextKeySet;", cancellable = true)
    private void getParamSet__1936415571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936415571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private static void lootTable_1142417496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142417496L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable$Builder());
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItems__522170986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-522170986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;Lnet/minecraft/util/RandomSource;)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void getRandomItems__1685043294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1685043294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItems_1090365571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1090365571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;JLjava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItems_853400493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(853400493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void getRandomItems_2010130022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2010130022L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;J)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void getRandomItems__773100420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773100420L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }


}
