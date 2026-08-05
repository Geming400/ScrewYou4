package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.class)
public class WorldCreationUiState_885421776Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__250038696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250038696L))
            info.setReturnValue("4@M!pduVr<!xNBoFzrr᐀J!|yjY(&A!#{럒y6j%㾡P;W4SN<q");
    }

    @Inject(at = @At("HEAD"), method = "setName(Ljava/lang/String;)V", cancellable = true)
    private void setName_2037782924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037782924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDebug()Z", cancellable = true)
    private void isDebug_923700358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923700358L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSeed()Ljava/lang/String;", cancellable = true)
    private void getSeed__250038696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250038696L))
            info.setReturnValue("4@M!pduVr<!xNBoFzrr᐀J!|yjY(&A!#{럒y6j%㾡P;W4SN<q");
    }

    @Inject(at = @At("HEAD"), method = "setSeed(Ljava/lang/String;)V", cancellable = true)
    private void setSeed_2037782924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037782924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void addListener_1566438188(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1566438188L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSettings()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;", cancellable = true)
    private void getSettings__1983596106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983596106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onChanged()V", cancellable = true)
    private void onChanged_923696514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(923696514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGameRules()Lnet/minecraft/world/level/gamerules/GameRules;", cancellable = true)
    private void getGameRules__1250967372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250967372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameMode()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$SelectedGameMode;", cancellable = true)
    private void getGameMode_861967892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861967892L))
            info.setReturnValue(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.SelectedGameMode.HARDCORE);
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void setDifficulty_478515621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(478515621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$SelectedGameMode;)V", cancellable = true)
    private void setGameMode_298312410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(298312410L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty__186330895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186330895L))
            info.setReturnValue(net.minecraft.world.Difficulty.NORMAL);
    }

    @Inject(at = @At("HEAD"), method = "setAllowCommands(Z)V", cancellable = true)
    private void setAllowCommands_2115038604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2115038604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTargetFolder()Ljava/lang/String;", cancellable = true)
    private void getTargetFolder__250038696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250038696L))
            info.setReturnValue("4@M!pduVr<!xNBoFzrr᐀J!|yjY(&A!#{럒y6j%㾡P;W4SN<q");
    }

    @Inject(at = @At("HEAD"), method = "setSettings(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;)V", cancellable = true)
    private void setSettings__1169070102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1169070102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateDimensions(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext$DimensionsUpdater;)V", cancellable = true)
    private void updateDimensions_1900589874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1900589874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isGenerateStructures()Z", cancellable = true)
    private void isGenerateStructures_923700358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923700358L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setGameRules(Lnet/minecraft/world/level/gamerules/GameRules;)V", cancellable = true)
    private void setGameRules__274754950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-274754950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonusChest()Z", cancellable = true)
    private void isBonusChest_923700358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923700358L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setBonusChest(Z)V", cancellable = true)
    private void setBonusChest_2115038604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2115038604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWorldType(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$WorldTypeEntry;)V", cancellable = true)
    private void setWorldType_772176996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(772176996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAltPresetList()Ljava/util/List;", cancellable = true)
    private void getAltPresetList__1783208705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783208705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWorldType()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$WorldTypeEntry;", cancellable = true)
    private void getWorldType_296202206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296202206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNormalPresetList()Ljava/util/List;", cancellable = true)
    private void getNormalPresetList__1783208705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783208705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPresetEditor()Lnet/minecraft/client/gui/screens/worldselection/PresetEditor;", cancellable = true)
    private void getPresetEditor_1275480488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275480488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setGenerateStructures(Z)V", cancellable = true)
    private void setGenerateStructures_2115038604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2115038604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore_923700358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923700358L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAllowCommands()Z", cancellable = true)
    private void isAllowCommands_923700358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923700358L))
            info.setReturnValue(false);
    }


}
