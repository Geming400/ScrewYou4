package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.UpgradeStatusTranslator.Messages.class)
public class Messages_1169843092Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_261216823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261216823L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1940266616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1940266616L))
            info.setReturnValue("FU<\u4F5BM\u8EA8y>}<p_,A@A_vEe\u4CDB}K4@p_wS\u6CE4o\u23C4GLuy1\u8069u CU-_Ykd>))W\u419Ew=kCC| Oz3KQINnb7#J7b J)5i[yZG=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1727195182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1727195182L))
            info.setReturnValue(1643516808);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/util/worldupdate/UpgradeStatusTranslator$Messages;", cancellable = true)
    private static void create_1700573576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700573576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finished()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void finished_2013623832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013623832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forStatus(Lnet/minecraft/util/worldupdate/UpgradeProgress$Status;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void forStatus__1677585938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1677585938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgrading()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void upgrading_1244931263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244931263L))
            info.setReturnValue(null);
    }


}
