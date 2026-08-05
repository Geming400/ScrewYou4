package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Difficulty.class)
public class Difficulty_1427684039Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void values__1308307943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1308307943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void valueOf__21071722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21071722L))
            info.setReturnValue(net.minecraft.world.Difficulty.EASY);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1465946284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1465946284L))
            info.setReturnValue(-262882245);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo__749225127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749225127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__749225127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749225127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void byName__21071722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21071722L))
            info.setReturnValue(net.minecraft.world.Difficulty.EASY);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void byId_597059143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597059143L))
            info.setReturnValue(net.minecraft.world.Difficulty.HARD);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_292223567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292223567L))
            info.setReturnValue("wRjL'HM2mLJ噥_PsV/弹]@i?,FX{UUN_o5鸣s囯:z≆&$`^CN2Rvm݄ꀇꊳ㦪 9mcy@q.F㴇G");
    }


}
