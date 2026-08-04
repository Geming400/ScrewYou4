package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.BlockModelGenerators.PlantType.class)
public class PlantType_1349073463Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;", cancellable = true)
    private static void values__870648020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870648020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/data/models/BlockModelGenerators$PlantType;", cancellable = true)
    private static void valueOf__1421782961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421782961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureMapping(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void getTextureMapping__1040187079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040187079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlantTextureMapping(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/client/data/models/model/TextureMapping;", cancellable = true)
    private void getPlantTextureMapping__1040187079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040187079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCrossPot()Lnet/minecraft/client/data/models/model/ModelTemplate;", cancellable = true)
    private void getCrossPot_2035407383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035407383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemModel(Lnet/minecraft/client/data/models/BlockModelGenerators;Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void createItemModel__1337963840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1337963840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCross()Lnet/minecraft/client/data/models/model/ModelTemplate;", cancellable = true)
    private void getCross_2035407383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035407383L))
            info.setReturnValue(null);
    }


}
