package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.fish.TropicalFish.class)
public class TropicalFish1470353136Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__1157906927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1157906927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPattern(I)Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private static void getPattern__1133091816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133091816L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.SPOTTY);
    }

    @Inject(at = @At("HEAD"), method = "getPattern()Lnet/minecraft/world/entity/animal/fish/TropicalFish$Pattern;", cancellable = true)
    private void getPattern_518082867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(518082867L))
            info.setReturnValue(net.minecraft.world.entity.animal.fish.TropicalFish.Pattern.FLOPPER);
    }

    @Inject(at = @At("HEAD"), method = "checkTropicalFishSpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkTropicalFishSpawnRules__1811536062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811536062L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isMaxGroupSizeReached(I)Z", cancellable = true)
    private void isMaxGroupSizeReached_620145196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(620145196L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveToBucketTag(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void saveToBucketTag__1648436368(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1648436368L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBucketItemStack()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getBucketItemStack_1674701897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674701897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor(I)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getBaseColor_227941187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(227941187L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BROWN);
    }

    @Inject(at = @At("HEAD"), method = "getBaseColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getBaseColor_114469850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114469850L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.MAGENTA);
    }

    @Inject(at = @At("HEAD"), method = "getPatternColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getPatternColor_62247789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62247789L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getPatternColor(I)Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private static void getPatternColor__1390942704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390942704L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.CYAN);
    }

    @Inject(at = @At("HEAD"), method = "getPredefinedName(I)Ljava/lang/String;", cancellable = true)
    private static void getPredefinedName__675463791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675463791L))
            info.setReturnValue(";/?A,6w\u23DD=SN.7;j99GSY\u4442/X/a*z'-p)ofnzDY0\u3C5Av2sI#[$w{!3:o#U?Ps4Ay,M\uB0E5kU29aW\uB4D6&%bV\"bq>B`88__yFFQ");
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__2074515851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074515851L))
            info.setReturnValue(null);
    }


}
