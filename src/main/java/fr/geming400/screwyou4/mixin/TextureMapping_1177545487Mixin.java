package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.TextureMapping.class)
public class TextureMapping_1177545487Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/client/data/models/model/TextureSlot;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void get_1206945077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206945077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "put(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void put__549666108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549666108L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "pattern(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void pattern__863225191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-863225191L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "fence(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fence_1618759418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618759418L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "top(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void top__2023442658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2023442658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "side(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void side_1982218912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982218912L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "column(Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void column_629707815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629707815L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "column(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void column__167280417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167280417L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "copyAndUpdate(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void copyAndUpdate_1878044104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878044104L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "forceAllTranslucent()Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void forceAllTranslucent__1286216154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286216154L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "particleFromItem(Lnet/minecraft/world/item/Item;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void particleFromItem_752844061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(752844061L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "pottedAzalea(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void pottedAzalea_259994759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259994759L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "getBlockTexture(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private static void getBlockTexture_317731629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(317731629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockTexture(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private static void getBlockTexture_491352567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(491352567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultTexture(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void defaultTexture_816176357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816176357L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "defaultTexture(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void defaultTexture_1964488739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964488739L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "driedGhast(Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void driedGhast__466497276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466497276L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "fire1(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fire1_426261764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426261764L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "candleCake(Lnet/minecraft/world/level/block/Block;Z)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void candleCake_812274942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(812274942L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "snifferEgg(Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void snifferEgg_981123681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(981123681L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "layered(Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layered__141860597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141860597L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "layered(Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layered_870327437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870327437L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "logColumn(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void logColumn__1192602557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192602557L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "layer0(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layer0__921856480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-921856480L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "layer0(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layer0__2134241208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134241208L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "layer0(Lnet/minecraft/world/item/Item;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void layer0_1678966937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1678966937L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "fan(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fan_1402970460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402970460L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "copyForced(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/data/models/model/TextureSlot;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void copyForced_755076531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755076531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flowerbed(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void flowerbed__241823281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241823281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pane(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void pane_1572928601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572928601L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "cubeTop(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cubeTop__1978361879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978361879L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "fire0(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fire0__89258685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89258685L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cross__722016001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722016001L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cross_1394031433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394031433L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "cube(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cube__1414397442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1414397442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cube(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cube_1121534378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121534378L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "commandBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void commandBlock_1701179019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701179019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void particle__1594593415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594593415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "particle(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void particle__2129604593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129604593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "campfire(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void campfire_643954048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643954048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bed(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/state/properties/BedPart;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void bed_1003447429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003447429L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "crop(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void crop_1546612911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546612911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cauldron(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cauldron__640570979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-640570979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rail(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void rail__1151640595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1151640595L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "rail(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void rail_1464142363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1464142363L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "door(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void door_1281817399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1281817399L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "door(Lnet/minecraft/client/resources/model/sprite/Material;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void door__441020209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-441020209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lantern(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void lantern_705106703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705106703L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "stem(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void stem__134152302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134152302L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "torch(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void torch__1541429243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1541429243L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "torch(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void torch__2086146877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2086146877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vault(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void vault__315635229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315635229L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "bars(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void bars_627902921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627902921L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "updateSlots(Ljava/util/function/BiFunction;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void updateSlots__547694922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547694922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cubeBottomTop(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cubeBottomTop__1203834818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203834818L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "cubeBottomTopWithWall(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void cubeBottomTopWithWall_791265038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(791265038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "columnWithWall(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void columnWithWall__496230737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-496230737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orientableCubeOnlyTop(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void orientableCubeOnlyTop_172441918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172441918L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "sculkShrieker(Z)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void sculkShrieker__1598352530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598352530L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "craftingTable(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void craftingTable__2113959659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113959659L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "getItemTexture(Lnet/minecraft/world/item/Item;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private static void getItemTexture_1892998968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1892998968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getItemTexture(Lnet/minecraft/world/item/Item;Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private static void getItemTexture_2107453998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107453998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fletchingTable(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void fletchingTable_955546459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955546459L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "orientableCube(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void orientableCube__994166275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-994166275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orientableCubeSameEnds(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void orientableCubeSameEnds_856487707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856487707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "crossEmissive(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void crossEmissive_1760821248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1760821248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plantEmissive(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void plantEmissive_2136638571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136638571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trialSpawner(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void trialSpawner_1755665807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755665807L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "plant(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void plant_1712432692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712432692L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "plant(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void plant__1301128524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301128524L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "wool(Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void wool_149131050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(149131050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wool(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void wool_1929798782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929798782L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "attachedStem(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void attachedStem_1235411668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235411668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "customParticle(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void customParticle__1781935520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781935520L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "getForced()Ljava/util/stream/Stream;", cancellable = true)
    private void getForced__1480016876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1480016876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "putForced(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void putForced__2057770325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057770325L))
            info.setReturnValue(new net.minecraft.client.data.models.model.TextureMapping());
    }

    @Inject(at = @At("HEAD"), method = "copySlot(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/data/models/model/TextureSlot;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void copySlot__650570962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-650570962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "singleSlot(Lnet/minecraft/client/data/models/model/TextureSlot;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private static void singleSlot_2065072837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065072837L))
            info.setReturnValue(null);
    }


}
