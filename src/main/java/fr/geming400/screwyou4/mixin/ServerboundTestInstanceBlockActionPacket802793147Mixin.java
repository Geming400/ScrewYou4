package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundTestInstanceBlockActionPacket.class)
public class ServerboundTestInstanceBlockActionPacket802793147Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_958660737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958660737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__105833121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105833121L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1573216672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1573216672L))
            info.setReturnValue("Wf6\u8899L{[i`K.\u3DA6L8T1<[/r5@&Q7\u5421^dce\u5722W2\u9778!a\uF95Bxs{Q@\u9CFB&\u9F0A}ivhr\u70E4\u4E3FCd]xYg^K[x]}NAE\u10E1z[\uA328yh!S+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1360145238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360145238L))
            info.setReturnValue(-1036237788);
    }

    @Inject(at = @At("HEAD"), method = "data()Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity$Data;", cancellable = true)
    private void data__1061226910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061226910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/protocol/game/ServerboundTestInstanceBlockActionPacket$Action;", cancellable = true)
    private void action__900076909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900076909L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundTestInstanceBlockActionPacket.Action.INIT);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1477983128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477983128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_507081284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(507081284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1440153321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1440153321L))
            info.cancel();
    }


}
