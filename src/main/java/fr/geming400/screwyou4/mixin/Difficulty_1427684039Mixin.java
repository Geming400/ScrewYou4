package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Difficulty.class)
public class Difficulty_1427684039Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void values_1430658615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1430658615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void valueOf_1480166846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480166846L))
            info.setReturnValue(net.minecraft.world.Difficulty.EASY);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__230639557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230639557L))
            info.setReturnValue(1505552165);
    }

    @Inject(at = @At("HEAD"), method = "getInfo()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getInfo_297524093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297524093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1686871088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686871088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byName(Ljava/lang/String;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void byName_836467352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836467352L))
            info.setReturnValue(net.minecraft.world.Difficulty.PEACEFUL);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private static void byId_2073650613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073650613L))
            info.setReturnValue(net.minecraft.world.Difficulty.PEACEFUL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1515892660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515892660L))
            info.setReturnValue("\u40B7\u3384XPO+\u6213\uD72E!=|:1Hhs\u4B99\uFDFEY/f\u51D5a\uFF27'iY:PO:1a-4");
    }


}
