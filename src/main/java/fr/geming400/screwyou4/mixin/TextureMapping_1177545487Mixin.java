package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.TextureMapping.class)
public class TextureMapping_1177545487Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/client/data/models/model/TextureSlot;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void get__965079969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965079969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void put_729380979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729380979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void pattern__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fence__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "top(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void top__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "side(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void side__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "column(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void column__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "column(Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void column_1121483837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121483837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTexture(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private static void getBlockTexture__1171952709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171952709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTexture(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private static void getBlockTexture_2123547633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2123547633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachedStem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void attachedStem__980317503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980317503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultTexture(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void defaultTexture__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultTexture(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void defaultTexture__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "commandBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void commandBlock__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceAllTranslucent()Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void forceAllTranslucent__1754289463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754289463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particleFromItem(Lnet/minecraft/world/item/Item;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void particleFromItem__719653798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719653798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyAndUpdate(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void copyAndUpdate_729380979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729380979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pottedAzalea(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void pottedAzalea__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trialSpawner(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void trialSpawner_21709213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21709213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sculkShrieker(Z)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void sculkShrieker__880185269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880185269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "craftingTable(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void craftingTable__980317503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980317503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orientableCube(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void orientableCube__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orientableCubeSameEnds(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void orientableCubeSameEnds__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fletchingTable(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fletchingTable__980317503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980317503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemTexture(Lnet/minecraft/world/item/Item;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private static void getItemTexture__1987363766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987363766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemTexture(Lnet/minecraft/world/item/Item;Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private static void getItemTexture_1884368576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884368576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customParticle(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void customParticle__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crossEmissive(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void crossEmissive__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plantEmissive(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void plantEmissive__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "campfire(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void campfire__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rail(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void rail__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rail(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void rail__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flowerbed(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void flowerbed__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyForced(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/data/models/model/TextureSlot;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void copyForced_801693473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801693473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pane(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void pane__980317503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980317503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cube(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cube__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cube(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cube__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stem(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void stem__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void particle__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void particle__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layer0(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layer0__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layer0(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layer0__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layer0(Lnet/minecraft/world/item/Item;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layer0__719653798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-719653798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layered(Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layered_1121483837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121483837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layered(Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layered_796333243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796333243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cross__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cross__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "door(Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void door_1121483837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121483837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "door(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void door__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fan(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fan__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "logColumn(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void logColumn__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plant(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void plant__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plant(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void plant__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cubeTop(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cubeTop__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cauldron(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cauldron__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fire1(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fire1__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fire0(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fire0__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vault(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void vault_1294407217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294407217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "torch(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void torch__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "torch(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void torch__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bars(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void bars__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "driedGhast(Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void driedGhast__1479173045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479173045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bed(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/BedPart;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void bed__357641340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357641340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "snifferEgg(Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void snifferEgg__1479173045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1479173045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "candleCake(Lnet/minecraft/world/level/block/Block;Z)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void candleCake__1240247805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1240247805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crop(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void crop__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getForced()Ljava/util/stream/Stream;", cancellable = true)
    private void getForced_966839171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966839171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putForced(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void putForced_729380979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729380979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lantern(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void lantern__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copySlot(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/data/models/model/TextureSlot;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void copySlot_801693473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801693473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "singleSlot(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void singleSlot_729381227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729381227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wool(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void wool__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wool(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void wool__1745815233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1745815233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cubeBottomTopWithWall(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cubeBottomTopWithWall__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columnWithWall(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void columnWithWall__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orientableCubeOnlyTop(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void orientableCubeOnlyTop__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSlots(Ljava/util/function/BiFunction;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void updateSlots__671218998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671218998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cubeBottomTop(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cubeBottomTop__1211714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211714807L))
            info.setReturnValue(null);
    }


}
