package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundRecipeBookSeenRecipePacket.class)
public class ServerboundRecipeBookSeenRecipePacket_284402075Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1394623014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1394623014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1669914333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669914333L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__851057901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851057901L))
            info.setReturnValue("u'?eF쮚%[*|鵮拔Le-#Y!7Sf읏룑_u>)hyP9gmk+GB-#F럿%mg⯋qI(v귇K퀆=I;⎇\" be&J1璪j u[%zUS66(d?+6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_322664816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322664816L))
            info.setReturnValue(556640262);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_962470987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(962470987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1584219920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584219920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recipe()Lnet/minecraft/world/item/crafting/display/RecipeDisplayId;", cancellable = true)
    private void recipe_1442828094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442828094L))
            info.setReturnValue(null);
    }


}
