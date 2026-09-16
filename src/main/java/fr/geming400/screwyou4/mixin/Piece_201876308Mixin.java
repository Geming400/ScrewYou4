package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugStructureInfo.Piece.class)
public class Piece_201876308Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__706749961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706749961L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_972299832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972299832L))
            info.setReturnValue("L@J/ASFqN=\"gIk;lqNn9AM-kp)!H'\uB66B:*$0Gxjbk2GO\u6DE0me,O;ah^]nUz=n\u94E3:\u454BS&\u1957L,I\u44B4Qi\"\u49A4GIaQ)K@eU\u29B00XOj");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_759228398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759228398L))
            info.setReturnValue(908369904);
    }

    @Inject(at = @At("HEAD"), method = "boundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void boundingBox__1603203484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603203484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStart()Z", cancellable = true)
    private void isStart_746987186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(746987186L))
            info.setReturnValue(false);
    }


}
