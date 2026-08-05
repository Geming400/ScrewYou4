package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.NoteBlockInstrument.class)
public class NoteBlockInstrument_1917667644Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/NoteBlockInstrument;", cancellable = true)
    private static void values_1521158904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1521158904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/NoteBlockInstrument;", cancellable = true)
    private static void valueOf_508424117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508424117L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.NoteBlockInstrument.GUITAR);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_782207172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(782207172L))
            info.setReturnValue("ힼ!ѩpS퍰J4rb盆/T䴡욟4e\"ephV0PmrA=k嘆CRds7q\"%f@:r赁f5枈42V頻됾]mWV} Lhc[UW+Xv랡$tbtJfLnGSg; ?퀷=펦/#!");
    }

    @Inject(at = @At("HEAD"), method = "isTunable()Z", cancellable = true)
    private void isTunable_1955946226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955946226L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasCustomSound()Z", cancellable = true)
    private void hasCustomSound_1955946226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955946226L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getSoundEvent__828423881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-828423881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "worksAboveNoteBlock()Z", cancellable = true)
    private void worksAboveNoteBlock_1955946226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955946226L))
            info.setReturnValue(false);
    }


}
