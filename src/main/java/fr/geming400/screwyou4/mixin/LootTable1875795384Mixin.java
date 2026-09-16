package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootTable.class)
public class LootTable1875795384Mixin {
        @Inject(at = @At("HEAD"), method = "fill(Lnet/minecraft/world/Container;Lnet/minecraft/world/level/storage/loot/LootParams;J)V", cancellable = true)
    private void fill_811834301(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(811834301L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_857076613(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(857076613L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;Lnet/minecraft/util/RandomSource;)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void getRandomItems_157427259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157427259L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItems__586546723(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-586546723L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItems__1405563044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1405563044L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;JLjava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItems_789024756(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(789024756L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void getRandomItems__785486675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-785486675L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;J)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;", cancellable = true)
    private void getRandomItems__1537872107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1537872107L))
            info.setReturnValue(new it.unimi.dsi.fastutil.objects.ObjectArrayList());
    }

    @Inject(at = @At("HEAD"), method = "lootTable()Lnet/minecraft/world/level/storage/loot/LootTable$Builder;", cancellable = true)
    private static void lootTable__883101730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883101730L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.LootTable.Builder());
    }

    @Inject(at = @At("HEAD"), method = "getRandomItemsRaw(Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItemsRaw__1546376713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1546376713L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomItemsRaw(Lnet/minecraft/world/level/storage/loot/LootParams;Ljava/util/function/Consumer;)V", cancellable = true)
    private void getRandomItemsRaw__1713619966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1713619966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getParamSet()Lnet/minecraft/util/context/ContextKeySet;", cancellable = true)
    private void getParamSet_1424837496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424837496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createStackSplitter(Lnet/minecraft/server/level/ServerLevel;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;", cancellable = true)
    private static void createStackSplitter__387800301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387800301L))
            info.setReturnValue(null);
    }


}
