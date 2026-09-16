package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.class)
public class WorldCreationUiState_885421776Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1003425127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003425127L))
            info.setReturnValue("w0Q=XwS5");
    }

    @Inject(at = @At("HEAD"), method = "setName(Ljava/lang/String;)V", cancellable = true)
    private void setName_293433567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(293433567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isDebug()Z", cancellable = true)
    private void isDebug_1163456221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163456221L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSeed()Ljava/lang/String;", cancellable = true)
    private void getSeed__1275939329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1275939329L))
            info.setReturnValue("CoF\u4818'\u43AFl%Xij$`qrP\uC7C8+9/xXd-lHCpob \u5868jKZJ8\uC53A4W");
    }

    @Inject(at = @At("HEAD"), method = "setSeed(Ljava/lang/String;)V", cancellable = true)
    private void setSeed_435427897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(435427897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGameRules()Lnet/minecraft/world/level/gamerules/GameRules;", cancellable = true)
    private void getGameRules_493316837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493316837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDifficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void getDifficulty__355517406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-355517406L))
            info.setReturnValue(net.minecraft.world.Difficulty.PEACEFUL);
    }

    @Inject(at = @At("HEAD"), method = "setGameMode(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$SelectedGameMode;)V", cancellable = true)
    private void setGameMode__163540591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-163540591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGameMode()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$SelectedGameMode;", cancellable = true)
    private void getGameMode_132250889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132250889L))
            info.setReturnValue(net.minecraft.client.gui.screens.worldselection.WorldCreationUiState.SelectedGameMode.HARDCORE);
    }

    @Inject(at = @At("HEAD"), method = "addListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void addListener_1039926881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1039926881L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDifficulty(Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void setDifficulty_937186824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(937186824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isHardcore()Z", cancellable = true)
    private void isHardcore__564578638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564578638L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateDimensions(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext$DimensionsUpdater;)V", cancellable = true)
    private void updateDimensions_290779516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(290779516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setGenerateStructures(Z)V", cancellable = true)
    private void setGenerateStructures_329847043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(329847043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBonusChest(Z)V", cancellable = true)
    private void setBonusChest__184132944(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-184132944L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWorldType(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$WorldTypeEntry;)V", cancellable = true)
    private void setWorldType__86719602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-86719602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPresetEditor()Lnet/minecraft/client/gui/screens/worldselection/PresetEditor;", cancellable = true)
    private void getPresetEditor__1155041078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155041078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNormalPresetList()Ljava/util/List;", cancellable = true)
    private void getNormalPresetList_1605746649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605746649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBonusChest()Z", cancellable = true)
    private void isBonusChest_1316090138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316090138L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWorldType()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationUiState$WorldTypeEntry;", cancellable = true)
    private void getWorldType__617131672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617131672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAltPresetList()Ljava/util/List;", cancellable = true)
    private void getAltPresetList__488120337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-488120337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isGenerateStructures()Z", cancellable = true)
    private void isGenerateStructures__690492313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690492313L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setGameRules(Lnet/minecraft/world/level/gamerules/GameRules;)V", cancellable = true)
    private void setGameRules_1932090589(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1932090589L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAllowCommands()Z", cancellable = true)
    private void isAllowCommands_340088063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340088063L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAllowCommands(Z)V", cancellable = true)
    private void setAllowCommands_1795426811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1795426811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSettings(Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;)V", cancellable = true)
    private void setSettings__436204507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436204507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTargetFolder()Ljava/lang/String;", cancellable = true)
    private void getTargetFolder__1376201619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376201619L))
            info.setReturnValue("*Z<ba}");
    }

    @Inject(at = @At("HEAD"), method = "onChanged()V", cancellable = true)
    private void onChanged__1120192819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1120192819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSettings()Lnet/minecraft/client/gui/screens/worldselection/WorldCreationContext;", cancellable = true)
    private void getSettings__1026686961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026686961L))
            info.setReturnValue(null);
    }


}
