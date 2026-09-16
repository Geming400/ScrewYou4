package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.NoteBlockInstrument.class)
public class NoteBlockInstrument_1917667644Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/NoteBlockInstrument;", cancellable = true)
    private static void values_1619874966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619874966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/NoteBlockInstrument;", cancellable = true)
    private static void valueOf__530723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530723L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.NoteBlockInstrument.PLING);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2005876265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2005876265L))
            info.setReturnValue("?]>se)sKXYx\u69DDt>uA\u5C45\uB4CCM/Z_L\u160FG#=F!ii?[\u51B7REr\uC3AC\u44BE\u5EF2bG&\u14F5>`\u8BB3\u77750h\uCE65rl3{\uD725]nx$XX$L|");
    }

    @Inject(at = @At("HEAD"), method = "worksAboveNoteBlock()Z", cancellable = true)
    private void worksAboveNoteBlock_297513522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297513522L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSoundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getSoundEvent_1709008470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709008470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasCustomSound()Z", cancellable = true)
    private void hasCustomSound_1983240270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983240270L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isTunable()Z", cancellable = true)
    private void isTunable__1218232139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218232139L))
            info.setReturnValue(false);
    }


}
