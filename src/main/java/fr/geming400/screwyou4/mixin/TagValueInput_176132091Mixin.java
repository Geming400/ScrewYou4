package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.class)
public class TagValueInput_176132091Mixin {
        @Inject(at = @At("HEAD"), method = "getInt(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getInt__2108799650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108799650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLong(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getLong__2108799650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108799650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "list(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Ljava/util/Optional;", cancellable = true)
    private void list__1823707977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823707977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookup()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void lookup__137075243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137075243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "child(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void child__2108799650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108799650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/ProblemReporter;Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/List;)Lnet/minecraft/world/level/storage/ValueInput$ValueInputList;", cancellable = true)
    private static void create__94721575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94721575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/ProblemReporter;Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/storage/ValueInput;", cancellable = true)
    private static void create__2060316144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060316144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Ljava/util/Optional;", cancellable = true)
    private void read__1823707977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1823707977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lcom/mojang/serialization/MapCodec;)Ljava/util/Optional;", cancellable = true)
    private void read__1107712039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107712039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getString(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getString__2108799650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108799650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDoubleOr(Ljava/lang/String;D)D", cancellable = true)
    private void getDoubleOr_1562354501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562354501L))
            info.setReturnValue(9.282671009176359E8D);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanOr(Ljava/lang/String;Z)Z", cancellable = true)
    private void getBooleanOr_1582693105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582693105L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStringOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getStringOr__1881956241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881956241L))
            info.setReturnValue("ぁjR_Wv60欬2혿鉃AM&コx]Ovr䎉r㛸@K}%c>稻FMCjHp控嬗aR7d28'nrwW88=ȥZdHc@E튶F<ApJ}x!鎗MC=#OkH");
    }

    @Inject(at = @At("HEAD"), method = "getIntArray(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getIntArray__2108799650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108799650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteOr(Ljava/lang/String;B)B", cancellable = true)
    private void getByteOr_1560505537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560505537L))
            info.setReturnValue(7);
    }

    @Inject(at = @At("HEAD"), method = "getShortOr(Ljava/lang/String;S)I", cancellable = true)
    private void getShortOr_1576212121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576212121L))
            info.setReturnValue(1990556512);
    }

    @Inject(at = @At("HEAD"), method = "getIntOr(Ljava/lang/String;I)I", cancellable = true)
    private void getIntOr_1566976911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566976911L))
            info.setReturnValue(-708461882);
    }

    @Inject(at = @At("HEAD"), method = "getFloatOr(Ljava/lang/String;F)F", cancellable = true)
    private void getFloatOr_1564203465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1564203465L))
            info.setReturnValue(9.282671E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLongOr(Ljava/lang/String;J)J", cancellable = true)
    private void getLongOr_1567901393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1567901393L))
            info.setReturnValue(-4154749096995047957L);
    }

    @Inject(at = @At("HEAD"), method = "childrenList(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void childrenList__2108799650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108799650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listOrEmpty(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;", cancellable = true)
    private void listOrEmpty_1555717398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555717398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "childOrEmpty(Ljava/lang/String;)Lnet/minecraft/world/level/storage/ValueInput;", cancellable = true)
    private void childOrEmpty_19010709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19010709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "childrenListOrEmpty(Ljava/lang/String;)Lnet/minecraft/world/level/storage/ValueInput$ValueInputList;", cancellable = true)
    private void childrenListOrEmpty__615902506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615902506L))
            info.setReturnValue(null);
    }


}
