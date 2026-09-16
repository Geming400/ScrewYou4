package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.class)
public class TagValueInput_176132091Mixin {
        @Inject(at = @At("HEAD"), method = "getInt(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getInt__515533097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-515533097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLong(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getLong_1964090832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964090832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "list(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Ljava/util/Optional;", cancellable = true)
    private void list__1881047083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881047083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookup()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void lookup__22640177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22640177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "child(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void child_2119702394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119702394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/ProblemReporter;Lnet/minecraft/core/HolderLookup$Provider;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/level/storage/ValueInput;", cancellable = true)
    private static void create_2082148756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082148756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/util/ProblemReporter;Lnet/minecraft/core/HolderLookup$Provider;Ljava/util/List;)Lnet/minecraft/world/level/storage/ValueInput$ValueInputList;", cancellable = true)
    private static void create__247223971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-247223971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Lcom/mojang/serialization/MapCodec;)Ljava/util/Optional;", cancellable = true)
    private void read__1332619133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332619133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Ljava/util/Optional;", cancellable = true)
    private void read_1110151885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1110151885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getString(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getString__877588571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-877588571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShortOr(Ljava/lang/String;S)I", cancellable = true)
    private void getShortOr__295983390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-295983390L))
            info.setReturnValue(-89964402);
    }

    @Inject(at = @At("HEAD"), method = "getIntOr(Ljava/lang/String;I)I", cancellable = true)
    private void getIntOr_1624014859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624014859L))
            info.setReturnValue(-1450360185);
    }

    @Inject(at = @At("HEAD"), method = "getFloatOr(Ljava/lang/String;F)F", cancellable = true)
    private void getFloatOr__492605454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492605454L))
            info.setReturnValue(5.306677E8F);
    }

    @Inject(at = @At("HEAD"), method = "listOrEmpty(Ljava/lang/String;Lcom/mojang/serialization/Codec;)Lnet/minecraft/world/level/storage/ValueInput$TypedInputList;", cancellable = true)
    private void listOrEmpty_1074814698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074814698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanOr(Ljava/lang/String;Z)Z", cancellable = true)
    private void getBooleanOr__568284826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-568284826L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDoubleOr(Ljava/lang/String;D)D", cancellable = true)
    private void getDoubleOr__476334001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476334001L))
            info.setReturnValue(5.306677008324536E8D);
    }

    @Inject(at = @At("HEAD"), method = "childrenList(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void childrenList__1382984613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382984613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "childOrEmpty(Ljava/lang/String;)Lnet/minecraft/world/level/storage/ValueInput;", cancellable = true)
    private void childOrEmpty_972908035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972908035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "childrenListOrEmpty(Ljava/lang/String;)Lnet/minecraft/world/level/storage/ValueInput$ValueInputList;", cancellable = true)
    private void childrenListOrEmpty__701395319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701395319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntArray(Ljava/lang/String;)Ljava/util/Optional;", cancellable = true)
    private void getIntArray_1796514430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796514430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringOr(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getStringOr__868616391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868616391L))
            info.setReturnValue("1y\u80A3Xb_\u5A85Yc-\u4201&\u7289{3Yoejv!Nsl&?*S2FV\u5546j.`\u761Cwznve\"%n@<\uBA91^`f 2]&:8,dt\"HOqAYIa{Rl");
    }

    @Inject(at = @At("HEAD"), method = "getLongOr(Ljava/lang/String;J)J", cancellable = true)
    private void getLongOr_1236122694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236122694L))
            info.setReturnValue(-1761602922445172651L);
    }

    @Inject(at = @At("HEAD"), method = "getByteOr(Ljava/lang/String;B)B", cancellable = true)
    private void getByteOr_299967938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(299967938L))
            info.setReturnValue(-1);
    }


}
