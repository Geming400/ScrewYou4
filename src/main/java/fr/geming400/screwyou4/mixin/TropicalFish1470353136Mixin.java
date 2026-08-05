package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.TropicalFish.class)
public class TropicalFish1470353136Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1307260731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1307260731L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getPattern()Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private void getPattern__1772831411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772831411L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.FLOPPER);
    }

    @Inject(at = @At("HEAD"), method = "getPattern(I)Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private static void getPattern_863009598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(863009598L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.SPOTTY);
    }

    @Inject(at = @At("HEAD"), method = "checkTropicalFishSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkTropicalFishSpawnRules_628089442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628089442L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPredefinedName(I)Ljava/lang/String;", cancellable = true)
    private static void getPredefinedName_49483800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49483800L))
            info.setReturnValue("mE84\u02C5jCj5W\uA42Aaawh-PNW:(P_ZX#;\u995A\uA14CF2y7?\u5C9Bgl?\uB72Eq\u6E5Cz7/ t\u3C6Cn18=T@p]k;cfhLgLSbf,\u8AD72,q\u8419ef\uFDA6\u0DD2(}(G*{\"o3G");
    }

    @Inject(at = @At("HEAD"), method = "getPatternColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getPatternColor__1389305930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389305930L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.RED);
    }

    @Inject(at = @At("HEAD"), method = "getPatternColor(I)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getPatternColor_855532263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855532263L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.CYAN);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__975882222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975882222L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMaxGroupSizeReached(I)Z", cancellable = true)
    private void isMaxGroupSizeReached__1610693344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1610693344L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor(I)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getBaseColor_855532263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(855532263L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.CYAN);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getBaseColor__1389305930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389305930L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.RED);
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_1993771796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1993771796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag__1090082872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1090082872L))
            info.cancel();
    }


}
